package xrj.exception.talkingdata;

import android.app.Application;

import com.tendcloud.tenddata.TCAgent;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		/*
		 * 捕捉异常
		 */
		CrashHandler catchHandler = CrashHandler.getInstance();
		catchHandler.init(getApplicationContext());
		/*
		 * 添加talking启动
		 */
		TCAgent.LOG_ON=true;
		// App ID: 在TalkingData创建应用后，进入数据报表页中，在“系统设置”-“编辑应用”页面里查看App ID。
		// 渠道 ID: 是渠道标识符，可通过不同渠道单独追踪数据。
		TCAgent.init(this, "813D954A7CC8449B911757AB32E661E8", "yidume");
		// 如果已经在AndroidManifest.xml配置了App ID和渠道ID，调用TCAgent.init(this)即可；或与AndroidManifest.xml中的对应参数保持一致。
		TCAgent.setReportUncaughtExceptions(true);

	}

}
