//package test;
//
//import java.io.File;
//import java.io.IOException;
//
//import android.R.string;
//import android.util.Log;
//
//import com.android.uiautomator.core.UiObject;
//import com.android.uiautomator.core.UiObjectNotFoundException;
//import com.android.uiautomator.core.UiSelector;
//import com.android.uiautomator.core.UiWatcher;
//import com.android.uiautomator.testrunner.UiAutomatorTestCase;
//
//public class test extends UiAutomatorTestCase{
//	private int i=0;
//	public void testmtbfBrowser() throws IOException, UiObjectNotFoundException{
//		
//		//���������                                                                
//		getUiDevice().registerWatcher("watchCrash", new UiWatcher() {
//			@Override
//			public boolean checkForCondition() {
//				UiObject crashObject = new UiObject(new UiSelector().textContains("ֹͣ����"));
//				if(crashObject.exists()){
//					Log.e("juny", "~~~~~~~~~~~������~~~~~~~~~~~~~");
//					File storePath = new File("sdcard/test");
//					getUiDevice().takeScreenshot(storePath);
//				}
//				return false;
//			}
//		});
//		
//		//ANR�����                                 
//		getUiDevice().registerWatcher("watchAnr", new UiWatcher() {
//			
//			@Override
//			public boolean checkForCondition() {
//				UiObject anroObject = new UiObject(new UiSelector().textContains("����Ӧ"));
//				if(anroObject.exists()){
//					Log.e("juny", "~~~~~~~~~~~ANR��~~~~~~~~~~~~~");
//					File storePath = new File("sdcard/test1");
//					getUiDevice().takeScreenshot(storePath);
//					}
//				return false;
//			}
//		});
//		callAndBrowser();
//		clearAndBrowser();
//		refreshWebsite();
//	
//	}
//	public void callAndBrowser() throws UiObjectNotFoundException, IOException{
//		//���Բ���
////		this.launchapplication("com.lenovo.browser", "com.lenovo.browser.LeMainActivity");
//		//�����������ͼ�����վ
//		clickMailSite();
//		getUiDevice().pressHome();
//		//����绰
//		UiObject callObject = new UiObject(new UiSelector().textMatches("�绰"));
//		callObject.click();
//		UiObject callhistory = new UiObject(new UiSelector().textMatches("ͨ����¼"));
//		callhistory.click();
//		UiObject mobileObject = new UiObject(new UiSelector().textMatches("�й���ͨ10010"));
//		mobileObject.click();
//		getUiDevice().pressHome();
//		//ˢ��ҳ��
//		UiObject browser = new UiObject(new UiSelector().textMatches("�����"));
//		browser.click();
//		getUiDevice().pressMenu();
//		UiObject refreshObject = new UiObject(new UiSelector().textMatches("ˢ��"));
//		refreshObject.click();
//		getUiDevice().pressHome();
//		//���عҶϵ绰
//		int width = getUiDevice().getDisplayWidth();
//		int hight = getUiDevice().getDisplayHeight();
//		getUiDevice().click(width/2, 25);
//		UiObject stopcall = new UiObject(new UiSelector().descriptionMatches("�Ҷ�").index(1));
//		stopcall.click();
//		//�˳������
//		browser.click();
//		sleep(2000);
//		exit();
//	}
//	
//	//������ݺ������ҳ
//	public void clearAndBrowser() throws IOException, UiObjectNotFoundException{
//		this.launchapplication("com.lenovo.browser", "com.lenovo.browser.LeMainActivity");
//		
//		//������ݺ��˳�
//		getUiDevice().pressMenu();
//		UiObject settingObject = new UiObject(new UiSelector().textMatches("����"));
//		settingObject.click();
//		UiObject cleardata = new UiObject(new UiSelector().className("android.widget.LinearLayout").instance(3).childSelector(new UiSelector().className("android.view.View").index(0)));
//		cleardata.click();
//		sleep(2000);
////		UiObject delete = new UiObject(new UiSelector().className("android.widget.FrameLayout").instance(4).childSelector(new UiSelector().className("android.view.View").index(2).childSelector(new UiSelector().className("android.view.View").index(0))));
//		UiObject delete = new UiObject(new UiSelector().className("android.view.View").instance(16));
//		delete.click();
//		
//		UiObject verify = new UiObject(new UiSelector().className("android.widget.FrameLayout").instance(2).childSelector(new UiSelector().className("android.widget.FrameLayout").index(2).childSelector(new UiSelector().className("android.view.View").index(0).childSelector(new UiSelector().className("android.view.View").index(0).childSelector(new UiSelector().className("android.view.View").index(2))))));
//		verify.click();
//		getUiDevice().pressBack();
//		getUiDevice().pressBack();
//		exit();
//		clickMailSite();
//		for(int i=0;i<2;i++){
//		UiObject gomail = new UiObject(new UiSelector().descriptionMatches("�Ƚ�����ҳ������ Link"));
//		int width = getUiDevice().getDisplayWidth();
//		int hight = getUiDevice().getDisplayHeight();
//		getUiDevice().swipe(width/2, hight*3/4, width/2, hight/4, 10);
//		gomail.click();
//		}
//		UiObject checkEnter = new UiObject(new UiSelector().descriptionMatches("�й������һƷ��"));
//		if(!checkEnter.exists()){
//			File filePath = new File("sdcard/checkweb");
//			getUiDevice().takeScreenshot(filePath);
//		}
//		exit();	
//	}
//	
//	public void refreshWebsite() throws UiObjectNotFoundException, IOException{
//		clickMailSite();
//		for(i=0;i<4;i++){
//		getUiDevice().pressMenu();
//		UiObject refreshObject = new UiObject(new UiSelector().textMatches("ˢ��"));
//		refreshObject.click();
//		sleep(5000);}
//		exit();
//	}
//	
//	  /**
//     * �˳�Ӧ��
//	 * @throws UiObjectNotFoundException 
//     */
//	public void exit() throws UiObjectNotFoundException{
//		UiObject multObject = new UiObject(new UiSelector().descriptionMatches("multi btn"));
//		if(multObject.exists()){
//		getUiDevice().pressMenu();
//		UiObject exitObject = new UiObject(new UiSelector().textMatches("�˳�"));
//		exitObject.click();
//		sleep(2000);
//		}else {
//			sleep(2000);
//		}
//	}
//    /**
//     * ��Ӧ��
//     * @throws IOException 
//     */
//	public void launchapplication(String string,String string2) throws IOException{
//		String shellcmd = "am start -n" + string + "/" + string2;
//		Runtime.getRuntime().exec(shellcmd);
//		sleep(2000);
//	}
//	public boolean waitForText(String string){
//		UiObject object2 = new UiObject(new UiSelector().textContains("string"));
//		assertNotNull(object2);
//		return true;
//	}
//	public void clickMailSite() throws UiObjectNotFoundException{
//		UiObject mailObject = new UiObject(new UiSelector().textContains("��������"));
//		if(!mailObject.exists()){
//			int width = getUiDevice().getDisplayWidth();
//			int hight = getUiDevice().getDisplayHeight();
//			getUiDevice().swipe(width, hight/2, 0, hight/2, 10);
//		}else {
//			mailObject.click();
//		}
//		sleep(3000);
//	}
//
//}
////