package se.uu.ub.cora.alvin.tocorastorage.fedora;

public class TestDataProvider {
	public static String place22_noCountry_XML = "<place id=\"1\">\n"
			+ "  <pid>alvin-place:22_2</pid>\n" + "  <dsId>METADATA</dsId>\n"
			+ "  <recordInfo id=\"2\">\n" + "    <externalDs>false</externalDs>\n"
			+ "    <lastAction>UPDATED</lastAction>\n" + "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 20:20:38.346 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 20:20:39.815 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>Testsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 20:21:20.880 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"11\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"12\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>Stefan.Andersson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <regions id=\"16\"/>\n" + "  <defaultPlaceName id=\"17\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Linköping</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"18\"/>\n" + "  <identifiers/>\n"
			+ "  <localIdentifiers id=\"19\">\n" + "    <localIdentifier>\n"
			+ "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n" + "      </type>\n"
			+ "      <text>1367</text>\n" + "    </localIdentifier>\n" + "  </localIdentifiers>\n"
			+ "  <longitude>15.62</longitude>\n" + "  <latitude>58.42</latitude>\n" + "</place>";

	public static String place22XML = "<place id=\"1\">\n" + "  <pid>alvin-place:22</pid>\n"
			+ "  <dsId>METADATA</dsId>\n" + "  <recordInfo id=\"2\">\n"
			+ "    <externalDs>false</externalDs>\n" + "    <lastAction>UPDATED</lastAction>\n"
			+ "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 20:20:38.346 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 20:20:39.815 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>Testsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 20:21:20.880 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"11\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"12\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>Stefan.Andersson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <country class=\"country\">\n"
			+ "    <lastUpdated class=\"sql-timestamp\" id=\"14\">2014-04-17 08:12:48.8</lastUpdated>\n"
			+ "    <defaultName>Sverige</defaultName>\n" + "    <localisedNames id=\"15\">\n"
			+ "      <entry>\n" + "        <string>en</string>\n"
			+ "        <string>Sweden</string>\n" + "      </entry>\n" + "    </localisedNames>\n"
			+ "    <alpha2Code>SE</alpha2Code>\n" + "    <alpha3Code>SWE</alpha3Code>\n"
			+ "    <numericalCode>752</numericalCode>\n" + "    <marcCode>sw</marcCode>\n"
			+ "  </country>\n" + "  <regions id=\"16\"/>\n" + "  <defaultPlaceName id=\"17\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Linköping</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"18\"/>\n" + "  <identifiers/>\n"
			+ "  <localIdentifiers id=\"19\">\n" + "    <localIdentifier>\n"
			+ "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n" + "      </type>\n"
			+ "      <text>1367</text>\n" + "    </localIdentifier>\n" + "  </localIdentifiers>\n"
			+ "  <longitude>15.62</longitude>\n" + "  <latitude>58.42</latitude>\n" + "</place>";

	public static String place24XML = "<place id=\"1\">\n" + "  <pid>alvin-place:24</pid>\n"
			+ "  <dsId>METADATA</dsId>\n" + "  <recordInfo id=\"2\">\n"
			+ "    <externalDs>false</externalDs>\n" + "    <lastAction>UPDATED</lastAction>\n"
			+ "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 22:16:44.623 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 22:16:44.919 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>TEstsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 22:18:01.276 UTC</date>\n"
			+ "        <dateInStorage id=\"11\">2014-12-18 22:18:01.579 UTC</dateInStorage>\n"
			+ "        <user class=\"seamUser\" id=\"12\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"13\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>test.testsson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n"
			+ "      <userAction id=\"14\">\n"
			+ "        <date id=\"15\">2016-02-12 10:29:43.147 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"16\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"17\">2014-04-17 08:12:53.455</lastUpdated>\n"
			+ "          <id>318</id>\n" + "          <userId>different</userId>\n"
			+ "          <domain>lu</domain>\n" + "          <firstName>Different</firstName>\n"
			+ "          <lastName>Test</lastName>\n"
			+ "          <email>test.testsson@ub.lu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <country class=\"country\">\n"
			+ "    <lastUpdated class=\"sql-timestamp\" id=\"19\">2014-04-17 08:12:48.8</lastUpdated>\n"
			+ "    <defaultName>Sverige</defaultName>\n" + "    <localisedNames id=\"20\">\n"
			+ "      <entry>\n" + "        <string>en</string>\n"
			+ "        <string>Sweden</string>\n" + "      </entry>\n" + "    </localisedNames>\n"
			+ "    <alpha2Code>SE</alpha2Code>\n" + "    <alpha3Code>SWE</alpha3Code>\n"
			+ "    <numericalCode>752</numericalCode>\n" + "    <marcCode>sw</marcCode>\n"
			+ "  </country>\n" + "  <regions id=\"21\"/>\n" + "  <defaultPlaceName id=\"22\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Lund</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"23\">\n" + "    <entry>\n"
			+ "      <string>alvin-place:24:0</string>\n" + "      <placeNameForm id=\"24\">\n"
			+ "        <id>alvin-place:24:0</id>\n" + "        <deleted>false</deleted>\n"
			+ "        <name>Londini Gothorum</name>\n" + "        <language id=\"25\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"26\">2014-04-17 08:12:51.134</lastUpdated>\n"
			+ "          <defaultName>Latin</defaultName>\n"
			+ "          <localisedNames id=\"27\">\n" + "            <entry>\n"
			+ "              <string>en</string>\n" + "              <string>Latin</string>\n"
			+ "            </entry>\n" + "          </localisedNames>\n"
			+ "          <alpha3Code>lat</alpha3Code>\n" + "          <alpha2Code>la</alpha2Code>\n"
			+ "        </language>\n" + "      </placeNameForm>\n" + "    </entry>\n"
			+ "  </placeNameForms>\n" + "  <identifiers id=\"28\"/>\n"
			+ "  <longitude>13.18</longitude>\n" + "  <latitude>55.7</latitude>\n"
			+ "  <localIdentifiers>\n" + "    <localIdentifier>\n"
			+ "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n"
			+ "        <unique>false</unique>\n" + "      </type>\n" + "      <text>873</text>\n"
			+ "    </localIdentifier>\n" + "  </localIdentifiers>\n" + "</place>\n" + "";
	public static String place24NoLatitudeXML = "<place id=\"1\">\n"
			+ "  <pid>alvin-place:24_noLatitude</pid>\n" + "  <dsId>METADATA</dsId>\n"
			+ "  <recordInfo id=\"2\">\n" + "    <externalDs>false</externalDs>\n"
			+ "    <lastAction>UPDATED</lastAction>\n" + "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 22:16:44.623 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 22:16:44.919 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>TEstsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 22:18:01.276 UTC</date>\n"
			+ "        <dateInStorage id=\"11\">2014-12-18 22:18:01.579 UTC</dateInStorage>\n"
			+ "        <user class=\"seamUser\" id=\"12\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"13\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>test.testsson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n"
			+ "      <userAction id=\"14\">\n"
			+ "        <date id=\"15\">2016-02-12 10:29:43.147 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"16\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"17\">2014-04-17 08:12:53.455</lastUpdated>\n"
			+ "          <id>318</id>\n" + "          <userId>different</userId>\n"
			+ "          <domain>lu</domain>\n" + "          <firstName>Different</firstName>\n"
			+ "          <lastName>Test</lastName>\n"
			+ "          <email>test.testsson@ub.lu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <country class=\"country\">\n"
			+ "    <lastUpdated class=\"sql-timestamp\" id=\"19\">2014-04-17 08:12:48.8</lastUpdated>\n"
			+ "    <defaultName>Sverige</defaultName>\n" + "    <localisedNames id=\"20\">\n"
			+ "      <entry>\n" + "        <string>en</string>\n"
			+ "        <string>Sweden</string>\n" + "      </entry>\n" + "    </localisedNames>\n"
			+ "    <alpha2Code>SE</alpha2Code>\n" + "    <alpha3Code>SWE</alpha3Code>\n"
			+ "    <numericalCode>752</numericalCode>\n" + "    <marcCode>sw</marcCode>\n"
			+ "  </country>\n" + "  <regions id=\"21\"/>\n" + "  <defaultPlaceName id=\"22\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Lund</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"23\">\n" + "    <entry>\n"
			+ "      <string>alvin-place:24:0</string>\n" + "      <placeNameForm id=\"24\">\n"
			+ "        <id>alvin-place:24:0</id>\n" + "        <deleted>false</deleted>\n"
			+ "        <name>Londini Gothorum</name>\n" + "        <language id=\"25\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"26\">2014-04-17 08:12:51.134</lastUpdated>\n"
			+ "          <defaultName>Latin</defaultName>\n"
			+ "          <localisedNames id=\"27\">\n" + "            <entry>\n"
			+ "              <string>en</string>\n" + "              <string>Latin</string>\n"
			+ "            </entry>\n" + "          </localisedNames>\n"
			+ "          <alpha3Code>lat</alpha3Code>\n" + "          <alpha2Code>la</alpha2Code>\n"
			+ "        </language>\n" + "      </placeNameForm>\n" + "    </entry>\n"
			+ "  </placeNameForms>\n" + "  <identifiers id=\"28\"/>\n"
			+ "  <longitude>13.18</longitude>\n" + "  <localIdentifiers>\n"
			+ "    <localIdentifier>\n" + "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n"
			+ "        <unique>false</unique>\n" + "      </type>\n" + "      <text>873</text>\n"
			+ "    </localIdentifier>\n" + "  </localIdentifiers>\n" + "</place>";
	public static String place24NoLongitudeXML = "<place id=\"1\">\n"
			+ "  <pid>alvin-place:24_noLongitude</pid>\n" + "  <dsId>METADATA</dsId>\n"
			+ "  <recordInfo id=\"2\">\n" + "    <externalDs>false</externalDs>\n"
			+ "    <lastAction>UPDATED</lastAction>\n" + "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 22:16:44.623 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 22:16:44.919 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>TEstsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 22:18:01.276 UTC</date>\n"
			+ "        <dateInStorage id=\"11\">2014-12-18 22:18:01.579 UTC</dateInStorage>\n"
			+ "        <user class=\"seamUser\" id=\"12\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"13\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>test.testsson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n"
			+ "      <userAction id=\"14\">\n"
			+ "        <date id=\"15\">2016-02-12 10:29:43.147 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"16\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"17\">2014-04-17 08:12:53.455</lastUpdated>\n"
			+ "          <id>318</id>\n" + "          <userId>different</userId>\n"
			+ "          <domain>lu</domain>\n" + "          <firstName>Different</firstName>\n"
			+ "          <lastName>Test</lastName>\n"
			+ "          <email>test.testsson@ub.lu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <regions id=\"21\"/>\n" + "  <defaultPlaceName id=\"22\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Lund</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"23\">\n" + "    <entry>\n"
			+ "      <string>alvin-place:24:0</string>\n" + "      <placeNameForm id=\"24\">\n"
			+ "        <id>alvin-place:24:0</id>\n" + "        <deleted>false</deleted>\n"
			+ "        <name>Londini Gothorum</name>\n" + "        <language id=\"25\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"26\">2014-04-17 08:12:51.134</lastUpdated>\n"
			+ "          <defaultName>Latin</defaultName>\n"
			+ "          <localisedNames id=\"27\">\n" + "            <entry>\n"
			+ "              <string>en</string>\n" + "              <string>Latin</string>\n"
			+ "            </entry>\n" + "          </localisedNames>\n"
			+ "          <alpha3Code>lat</alpha3Code>\n" + "          <alpha2Code>la</alpha2Code>\n"
			+ "        </language>\n" + "      </placeNameForm>\n" + "    </entry>\n"
			+ "  </placeNameForms>\n" + "  <identifiers id=\"28\"/>\n"
			+ "  <latitude>55.7</latitude>\n" + "  <localIdentifiers>\n" + "    <localIdentifier>\n"
			+ "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n"
			+ "        <unique>false</unique>\n" + "      </type>\n" + "      <text>873</text>\n"
			+ "    </localIdentifier>\n" + "  </localIdentifiers>\n" + "</place>";
	public static String place24NoCoordinates = "<place id=\"1\">\n"
			+ "  <pid>alvin-place:24_noCoordinates</pid>\n" + "  <dsId>METADATA</dsId>\n"
			+ "  <recordInfo id=\"2\">\n" + "    <externalDs>false</externalDs>\n"
			+ "    <lastAction>UPDATED</lastAction>\n" + "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 22:16:44.623 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 22:16:44.919 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>TEstsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 22:18:01.276 UTC</date>\n"
			+ "        <dateInStorage id=\"11\">2014-12-18 22:18:01.579 UTC</dateInStorage>\n"
			+ "        <user class=\"seamUser\" id=\"12\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"13\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>test.testsson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n"
			+ "      <userAction id=\"14\">\n"
			+ "        <date id=\"15\">2016-02-12 10:29:43.147 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"16\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"17\">2014-04-17 08:12:53.455</lastUpdated>\n"
			+ "          <id>318</id>\n" + "          <userId>different</userId>\n"
			+ "          <domain>lu</domain>\n" + "          <firstName>Different</firstName>\n"
			+ "          <lastName>Test</lastName>\n"
			+ "          <email>test.testsson@ub.lu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <regions id=\"21\"/>\n" + "  <defaultPlaceName id=\"22\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Lund</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"23\">\n" + "    <entry>\n"
			+ "      <string>alvin-place:24:0</string>\n" + "      <placeNameForm id=\"24\">\n"
			+ "        <id>alvin-place:24:0</id>\n" + "        <deleted>false</deleted>\n"
			+ "        <name>Londini Gothorum</name>\n" + "        <language id=\"25\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"26\">2014-04-17 08:12:51.134</lastUpdated>\n"
			+ "          <defaultName>Latin</defaultName>\n"
			+ "          <localisedNames id=\"27\">\n" + "            <entry>\n"
			+ "              <string>en</string>\n" + "              <string>Latin</string>\n"
			+ "            </entry>\n" + "          </localisedNames>\n"
			+ "          <alpha3Code>lat</alpha3Code>\n" + "          <alpha2Code>la</alpha2Code>\n"
			+ "        </language>\n" + "      </placeNameForm>\n" + "    </entry>\n"
			+ "  </placeNameForms>\n" + "  <identifiers id=\"28\"/>\n" + "  <localIdentifiers>\n"
			+ "    <localIdentifier>\n" + "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n"
			+ "        <unique>false</unique>\n" + "      </type>\n" + "      <text>873</text>\n"
			+ "    </localIdentifier>\n" + "  </localIdentifiers>\n" + "</place>";

	public static String place5NoTsUpdated = "<place id=\"1\">\n" + "<pid>alvin-place:5</pid>\n"
			+ "<dsId>METADATA</dsId>\n" + "<recordInfo id=\"2\">\n"
			+ "<externalDs>false</externalDs>\n" + "<lastAction>CREATED</lastAction>\n"
			+ "<created id=\"3\">\n" + "<date id=\"4\">2017-10-27 22:36:51.991 UTC</date>\n"
			+ "<user class=\"authenticatedUser\" id=\"5\">\n" + "<userId>mimsu695</userId>\n"
			+ "<domain>uu</domain>\n" + "<firstName>Mimmi</firstName><lastName>Sundin</lastName>\n"
			+ "<email></email>\n" + "</user>\n" + "<note>Place created from import</note>\n"
			+ "<type>CREATED</type></created>\n" + "<updated id=\"6\">\n"
			+ "<userAction reference=\"3\"/>\n" + "</updated>\n"
			+ "</recordInfo><regions id=\"7\"/>\n" + "<defaultPlaceName id=\"8\">\n"
			+ "<deleted>false</deleted>\n" + "<name>Uddetorp</name>\n" + "</defaultPlaceName>\n"
			+ "<placeNameForms id=\"9\"/>\n" + "<identifiers id=\"10\"/>\n"
			+ "<localIdentifiers id=\"11\"/>\n" + "</place>";

	public static String place24DoublePlacesXML = "<place id=\"1\">\n"
			+ "  <pid>alvin-place:24</pid>\n" + "  <dsId>METADATA</dsId>\n"
			+ "  <recordInfo id=\"2\">\n" + "    <externalDs>false</externalDs>\n"
			+ "    <lastAction>UPDATED</lastAction>\n" + "    <created id=\"3\">\n"
			+ "      <date id=\"4\">2014-12-18 22:16:44.623 UTC</date>\n"
			+ "      <dateInStorage id=\"5\">2014-12-18 22:16:44.919 UTC</dateInStorage>\n"
			+ "      <user class=\"seamUser\" id=\"6\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\" id=\"7\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "        <id>1</id>\n" + "        <userId>test</userId>\n"
			+ "        <domain>uu</domain>\n" + "        <firstName>Test</firstName>\n"
			+ "        <lastName>TEstsson</lastName>\n"
			+ "        <email>test.testsson@ub.uu.se</email>\n" + "      </user>\n"
			+ "      <note>Place created through web gui</note>\n" + "      <type>CREATED</type>\n"
			+ "    </created>\n" + "    <updated id=\"8\">\n"
			+ "      <userAction reference=\"3\"/>\n" + "      <userAction id=\"9\">\n"
			+ "        <date id=\"10\">2014-12-18 22:18:01.276 UTC</date>\n"
			+ "        <dateInStorage id=\"11\">2014-12-18 22:18:01.579 UTC</dateInStorage>\n"
			+ "        <user class=\"seamUser\" id=\"12\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"13\">2014-04-17 08:12:52.806</lastUpdated>\n"
			+ "          <id>1</id>\n" + "          <userId>test</userId>\n"
			+ "          <domain>uu</domain>\n" + "          <firstName>Test</firstName>\n"
			+ "          <lastName>Testsson</lastName>\n"
			+ "          <email>test.testsson@ub.uu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n"
			+ "      <userAction id=\"14\">\n"
			+ "        <date id=\"15\">2016-02-12 10:29:43.147 UTC</date>\n"
			+ "        <user class=\"seamUser\" id=\"16\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"17\">2014-04-17 08:12:53.455</lastUpdated>\n"
			+ "          <id>318</id>\n" + "          <userId>different</userId>\n"
			+ "          <domain>lu</domain>\n" + "          <firstName>Different</firstName>\n"
			+ "          <lastName>Test</lastName>\n"
			+ "          <email>test.testsson@ub.lu.se</email>\n" + "        </user>\n"
			+ "        <note>Place updated through web gui</note>\n"
			+ "        <type>UPDATED</type>\n" + "      </userAction>\n" + "    </updated>\n"
			+ "  </recordInfo>\n" + "  <country class=\"country\">\n"
			+ "    <lastUpdated class=\"sql-timestamp\" id=\"19\">2014-04-17 08:12:48.8</lastUpdated>\n"
			+ "    <defaultName>Sverige</defaultName>\n" + "    <localisedNames id=\"20\">\n"
			+ "      <entry>\n" + "        <string>en</string>\n"
			+ "        <string>Sweden</string>\n" + "      </entry>\n" + "    </localisedNames>\n"
			+ "    <alpha2Code>SE</alpha2Code>\n" + "    <alpha3Code>SWE</alpha3Code>\n"
			+ "    <numericalCode>752</numericalCode>\n" + "    <marcCode>sw</marcCode>\n"
			+ "  </country>\n" + "  <regions id=\"21\"/>\n" + "  <defaultPlaceName id=\"22\">\n"
			+ "    <deleted>false</deleted>\n" + "    <name>Lund</name>\n"
			+ "  </defaultPlaceName>\n" + "  <placeNameForms id=\"23\">\n" + "    <entry>\n"
			+ "      <string>alvin-place:24:0</string>\n" + "      <placeNameForm id=\"24\">\n"
			+ "        <id>alvin-place:24:0</id>\n" + "        <deleted>false</deleted>\n"
			+ "        <name>Londini Gothorum</name>\n" + "        <language id=\"25\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"26\">2014-04-17 08:12:51.134</lastUpdated>\n"
			+ "          <defaultName>Latin</defaultName>\n"
			+ "          <localisedNames id=\"27\">\n" + "            <entry>\n"
			+ "              <string>en</string>\n" + "              <string>Latin</string>\n"
			+ "            </entry>\n" + "          </localisedNames>\n"
			+ "          <alpha3Code>lat</alpha3Code>\n" + "          <alpha2Code>la</alpha2Code>\n"
			+ "        </language>\n" + "      </placeNameForm>\n" + "    </entry>\n"
			+ "    <entry>\n" + "      <string>alvin-place:24:1</string>\n"
			+ "      <placeNameForm id=\"24\">\n" + "        <id>alvin-place:24:1</id>\n"
			+ "        <deleted>false</deleted>\n" + "        <name>Ankeborg</name>\n"
			+ "        <language id=\"25\">\n"
			+ "          <lastUpdated class=\"sql-timestamp\" id=\"26\">2014-04-17 08:12:51.134</lastUpdated>\n"
			+ "          <defaultName>Latin</defaultName>\n"
			+ "          <localisedNames id=\"27\">\n" + "            <entry>\n"
			+ "              <string>en</string>\n" + "              <string>Latin</string>\n"
			+ "            </entry>\n" + "          </localisedNames>\n"
			+ "          <alpha3Code>swe</alpha3Code>\n" + "          <alpha2Code>la</alpha2Code>\n"
			+ "        </language>\n" + "      </placeNameForm>\n" + "    </entry>\n"
			+ "  </placeNameForms>\n" + "  <identifiers id=\"28\"/>\n"
			+ "  <longitude>13.18</longitude>\n" + "  <latitude>55.7</latitude>\n"
			+ "  <localIdentifiers>\n" + "    <localIdentifier>\n"
			+ "      <type class=\"localIdentifierType\">\n"
			+ "        <lastUpdated class=\"sql-timestamp\">2014-04-17 08:49:50.65</lastUpdated>\n"
			+ "        <defaultName>Waller-id</defaultName>\n" + "        <localisedNames/>\n"
			+ "        <code>waller</code>\n" + "        <id>114</id>\n"
			+ "        <internal>false</internal>\n"
			+ "        <organisationUnitId>2</organisationUnitId>\n"
			+ "        <unique>false</unique>\n" + "      </type>\n" + "      <text>873</text>\n"
			+ "    </localIdentifier>\n" + "  </localIdentifiers>\n" + "</place>\n" + "";

}
