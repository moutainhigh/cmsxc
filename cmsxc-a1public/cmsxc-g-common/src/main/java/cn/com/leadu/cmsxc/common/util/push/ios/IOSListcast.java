package cn.com.leadu.cmsxc.common.util.push.ios;


import cn.com.leadu.cmsxc.common.util.push.IOSNotification;

public class IOSListcast extends IOSNotification {
	public IOSListcast(String appkey, String appMasterSecret) throws Exception{
			setAppMasterSecret(appMasterSecret);
			setPredefinedKeyValue("appkey", appkey);
			this.setPredefinedKeyValue("type", "listcast");
	}
	
	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }
}
