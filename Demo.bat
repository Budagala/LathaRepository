set projectlocation=F:\LathaSelenium\SeleniumJenkinsDemo

cd %projectlocation%

set classpath=%projectlocation%\bin;%projectlocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause
