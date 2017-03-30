# cordova_talkingdataSDK
cordova_talkingdataSDK 
 
 
 为了 使用 talkingdata 来打渠道包 , 所以   ionic android 项目中要加入 它的最新的 SDK , 
 
 使用时 : 
 1 使用最新的 官方 jar 文件 
 2 把 plugin.xml 里的 APPID 换成你自己的 talkingdata android应用的 id
 3 最后 ionic build android 前, 在 AndroidManifest.xml 里的 <application 里添加属性 android:name="xrj.exception.talkingdata.MyApplication"
 4 使用 ionic build android 后 的 apk 包 , 签名后 , 在渠道打包工具里使用即可 
