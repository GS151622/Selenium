import org.testng.annotations.Test;


//Command for command line --
/*
Can execute below command
  set ProjectPath=C:\Users\SHARMSX14\eclipse-workspace\Selenium-Samples
  set ClassPath=%ProjectPath%\bin;%ProjectPath%\Lib\*
  java org.testng.TestNg testng.xml
 	
Or execute one single command as:
  java -cp \bin;\lib\* org.testng.TestNg testng.xml
*/
public class CommandLine {
	@Test
	public void Test1() {
		System.out.println("This is test1");
	}
}
