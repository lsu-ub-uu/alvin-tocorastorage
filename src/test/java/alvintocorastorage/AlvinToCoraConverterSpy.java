package alvintocorastorage;

import se.uu.ub.cora.bookkeeper.data.DataGroup;

public class AlvinToCoraConverterSpy implements AlvinToCoraConverter {

	public String xml;
	public DataGroup convertedDataGroup;

	@Override
	public DataGroup fromXML(String xml) {
		this.xml = xml;
		convertedDataGroup = DataGroup.withNameInData("Converted xml");
		return convertedDataGroup;
	}

}
