/*
 * Copyright 2018 Uppsala University Library
 *
 * This file is part of Cora.
 *
 *     Cora is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Cora is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Cora.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.uu.ub.cora.alvin.tocorastorage.fedora;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import se.uu.ub.cora.bookkeeper.data.DataAtomic;
import se.uu.ub.cora.bookkeeper.data.DataGroup;

public class AlvinFedoraToCoraRecordInfoConverter {
	private XMLXPathParser parser;
	private DataGroup recordInfo;

	public AlvinFedoraToCoraRecordInfoConverter(XMLXPathParser parser) {
		this.parser = parser;
	}

	public static DataGroup createRecordInfo(XMLXPathParser parser) {
		AlvinFedoraToCoraRecordInfoConverter alvinToCoraRecordInfoConverter = new AlvinFedoraToCoraRecordInfoConverter(
				parser);
		return alvinToCoraRecordInfoConverter.createRecordInfoAsDataGroup();
	}

	private DataGroup createRecordInfoAsDataGroup() {
		recordInfo = DataGroup.withNameInData("recordInfo");
		addType();
		parseAndAddId();
		addDataDivider();
		addCreatedBy();
		parseAndAddTsCreated();

		NodeList userUpdates = parser
				.getNodeListFromDocumentUsingXPath("/place/recordInfo/updated/userAction");
		for (int i = 0; i < userUpdates.getLength(); i++) {
			Node userUpdated = userUpdates.item(i);

			NodeList childNodes = userUpdated.getChildNodes();
			if (childNodes.getLength() > 0) {
				DataGroup updated = DataGroup.withNameInData("updated");
				updated.setRepeatId(String.valueOf(i));
				addUpdatedBy(updated);
				parseAndAddTsUpdated(updated, userUpdated);

				recordInfo.addChild(updated);
			}
		}
		if (!recordInfo.containsChildWithNameInData("updated")) {
			DataGroup updated = DataGroup.withNameInData("updated");
			updated.setRepeatId(String.valueOf("0"));
			addUpdatedBy(updated);
			updated.addChild(
					DataAtomic.withNameInDataAndValue("tsUpdated", tsCreatedToUseAsTsUpdated()));
			recordInfo.addChild(updated);
		}
		return recordInfo;
	}

	private void addType() {
		DataGroup type = createLinkWithNameInDataAndTypeAndId("type", "recordType", "place");
		recordInfo.addChild(type);
	}

	private static DataGroup createLinkWithNameInDataAndTypeAndId(String nameInData,
			String linkedRecordType, String linkedRecordId) {
		DataGroup type = DataGroup.withNameInData(nameInData);
		type.addChild(DataAtomic.withNameInDataAndValue("linkedRecordType", linkedRecordType));
		type.addChild(DataAtomic.withNameInDataAndValue("linkedRecordId", linkedRecordId));
		return type;
	}

	private void parseAndAddId() {
		String pid = parser.getStringFromDocumentUsingXPath("/place/pid/text()");
		recordInfo.addChild(DataAtomic.withNameInDataAndValue("id", pid));
	}

	private void addDataDivider() {
		DataGroup dataDivider = createLinkWithNameInDataAndTypeAndId("dataDivider", "system",
				"alvin");
		recordInfo.addChild(dataDivider);
	}

	private void addCreatedBy() {
		DataGroup createdBy = createLinkWithNameInDataAndTypeAndId("createdBy", "user", "12345");
		recordInfo.addChild(createdBy);
	}

	private void parseAndAddTsCreated() {
		String tsCreatedWithUTC = parser
				.getStringFromDocumentUsingXPath("/place/recordInfo/created/date/text()");
		String tsCreated = removeUTCFromTimestamp(tsCreatedWithUTC);
		recordInfo.addChild(DataAtomic.withNameInDataAndValue("tsCreated", tsCreated));
	}

	private String removeUTCFromTimestamp(String tsCreatedWithUTC) {
		return tsCreatedWithUTC.substring(0, tsCreatedWithUTC.indexOf("UTC") - 1);
	}

	private void addUpdatedBy(DataGroup updated) {
		DataGroup updatedBy = createLinkWithNameInDataAndTypeAndId("updatedBy", "user", "12345");
		updated.addChild(updatedBy);
	}

	private void parseAndAddTsUpdated(DataGroup updated, Node node) {
		// String tsUpdatedWithUTC = getLastTsUpdatedFromDocument();
		String tsUpdatedWithUTC = parser.getStringFromNodeUsingXPath(node, "date/text()");

		String tsUpdated = removeUTCFromTimestampOrUseTsCreated(tsUpdatedWithUTC);
		updated.addChild(DataAtomic.withNameInDataAndValue("tsUpdated", tsUpdated));
	}

	private String getLastTsUpdatedFromDocument() {
		NodeList list = parser.getNodeListFromDocumentUsingXPath(
				"/place/recordInfo/updated/userAction/date/text()");
		Node item = getTheLastTsUpdatedAsItShouldBeTheLatest(list);
		return item != null ? item.getTextContent() : "";
	}

	private Node getTheLastTsUpdatedAsItShouldBeTheLatest(NodeList list) {
		return list.item(list.getLength() - 1);
	}

	private String removeUTCFromTimestampOrUseTsCreated(String tsUpdatedWithUTC) {
		if (isNotEmpty(tsUpdatedWithUTC)) {
			return removeUTCFromTimestamp(tsUpdatedWithUTC);
		}
		return tsCreatedToUseAsTsUpdated();
	}

	private boolean isNotEmpty(String tsUpdatedWithUTC) {
		return !"".equals(tsUpdatedWithUTC);
	}

	private String tsCreatedToUseAsTsUpdated() {
		return recordInfo.getFirstAtomicValueWithNameInData("tsCreated");
	}
}
