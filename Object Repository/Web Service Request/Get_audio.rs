<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET_audio</name>
   <tag></tag>
   <elementGuidId>3ee7a9bd-f3b0-4591-bda6-b59683b47f16</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${mp3Url}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.mp3Url</defaultValue>
      <description></description>
      <id>a9452957-40d7-46e0-91fa-d6ffc1e93b0e</id>
      <masked>false</masked>
      <name>mp3Url</name>
   </variables>
   <verificationScript>import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager



RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getHeaderFields().get('Content-Type').toString()).isEqualTo('[audio/mp3]')
assertThat(response.getHeaderFields().get('x-amz-meta-upload-track-name').toString()).isEqualTo('[testAudio]')
assertThat(response.getHeaderFields().get('x-amz-meta-content-length').toString()).isEqualTo('[351224]')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
