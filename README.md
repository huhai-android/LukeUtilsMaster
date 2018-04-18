# LukeUtilsMaster
老胡整理的工具类，后面会不断更新，自己在项目里边使用

使用方法
在工程build.gradle加入

	allprojects {
		repositories {

			maven { url 'https://jitpack.io' }
		}
	}

在项目build.gradle加入
dependencies {

	        compile 'com.github.huhaiAndroid:LukeUtilsMaster:1.1'
	
}

暂时的工具类集合有

DateUtil时间相关<br /> 
DisplayUtil屏幕单位换算<br /> 
FileUtils文件处理相关<br /> 
LogUtils输出日志<br /> 
NetWorkUtils网络相关<br /> 
PackageUtils包相关<br /> 
SDCardUtils内存卡相关<br /> 
SpUtils存储相关<br /> 
ToastUtil吐司相关<br /> 
WindowUtils获取屏幕宽高<br /> 
JsonUtil json转换<br /> 
RegularUtils正则表达式<br /> 
