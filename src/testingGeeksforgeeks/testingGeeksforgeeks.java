
package testingGeeksforgeeks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.FileInputStream;		
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class  testingGeeksforgeeks {
	
	static Properties obj = new Properties();	
	@Test
   public void verifyGeeksforgeeks() throws IOException, InterruptedException {
		
    System.out.println("launching chrome browser"); 
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    WebDriver driver;			
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
   // Properties obj = new Properties();		
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\geeksforgeeks.properties");									
    obj.load(objfile);	
    String baseUrl = "https://www.geeksforgeeks.org/data-structures-and-algorithms-online-courses-free-and-paid/";
    driver.get(baseUrl);
   
    List<WebElement> linksize = driver.findElements(By.xpath(obj.getProperty("a"))); 
    int linksCount = linksize.size();
    String[] links= new String[linksCount];
    System.out.println(linksCount);
    for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	}
    
	for(int i=1;i<linksCount-1;i=i+2)
	{
	String actual = driver.findElement(By.xpath("//a[@href= \""+ links[i] +"\"]")).getText();
	System.out.println(actual);	
	driver.navigate().to(links[i]);
	Thread.sleep(30);
	Assert.assertTrue(actual.equalsIgnoreCase(driver.findElement(By.xpath(obj.getProperty("assert"))).getText()));
	driver.navigate().back();
	  Thread.sleep(30);
	  
	}
	
	
	    //          for dropdown ALgo 
    
		 linksize = driver.findElements(By.xpath(obj.getProperty("menubar")));
		 linksCount = linksize.size();
		 System.out.println(linksCount);	 
		 // Open the dropdown so the options are visible
         WebElement link_Home = driver.findElement(By.linkText(obj.getProperty("d1")));
		 Actions builder = new Actions(driver);
         Action mouseOverHome = builder.moveToElement(link_Home).build();
         mouseOverHome.perform();
         WebElement dropdown = driver.findElement(By.xpath(obj.getProperty("algoidxpath")));
         List<WebElement> options = dropdown.findElements(By.xpath(obj.getProperty("algolixpath")));
         for (WebElement option : options)
         {
        	 System.out.println(option.getText());
             if (option.getText().equals("All Algorithms"))
             {
                 option.click(); // click the desired option
                 break;
             }
             
         }
        
         
        
        //       for drop down DS
         
         
        	 link_Home = driver.findElement(By.xpath(obj.getProperty("dsidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
            
             dropdown = driver.findElement(By.xpath(obj.getProperty("dsidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("dslixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("Matrix"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
             
       //           for drop down Language
             link_Home = driver.findElement(By.xpath(obj.getProperty("languageidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
             
             dropdown = driver.findElement(By.xpath(obj.getProperty("languageidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("languagelixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("PHP"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
             
             
             //           for dropdown INTERVIEW
             link_Home = driver.findElement(By.xpath(obj.getProperty("interviewidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
             
             dropdown = driver.findElement(By.xpath(obj.getProperty("interviewidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("interviewlixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("Internship Interviews"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
            
             
             
             //           for dropdown student
             link_Home = driver.findElement(By.xpath(obj.getProperty("studentidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
             
             dropdown = driver.findElement(By.xpath(obj.getProperty("studentidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("studentlixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("Placement Course"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
             
             
             //           for dropdown gate
             link_Home = driver.findElement(By.xpath(obj.getProperty("gateidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
             
             dropdown = driver.findElement(By.xpath(obj.getProperty("gateidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("gatelixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("GATE 2020"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
        	 
         

             //           for dropdown cssubjects
             link_Home = driver.findElement(By.xpath(obj.getProperty("cssubjectsidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
             
             dropdown = driver.findElement(By.xpath(obj.getProperty("cssubjectsidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("cssubjectslixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("Machine Learning"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
             
             
             

             //           for dropdown quizzes
             link_Home = driver.findElement(By.xpath(obj.getProperty("quizzesidxpath")));
    		 mouseOverHome = builder.moveToElement(link_Home).build();
             mouseOverHome.perform();
             
             dropdown = driver.findElement(By.xpath(obj.getProperty("quizzesidxpath")));
             options = dropdown.findElements(By.xpath(obj.getProperty("quizzeslixpath")));
             for (WebElement option : options)
             {
            	 System.out.println(option.getText());
                 if (option.getText().equals("Aptitude"))
                 {
                     option.click(); // click the desired option
                     break;
                 }
             }
             
              //         for  menubar gblog
              driver.findElement(By.xpath(obj.getProperty("gblogidxpath"))).click();
    		  Assert.assertTrue(driver.findElement(By.xpath(obj.getProperty("gbloglixpath"))).getText().equalsIgnoreCase("Virtual Reality vs Augmented Reality: What’s the difference?"));
             
          
    		  //        for  menubar puzzles
              driver.findElement(By.xpath(obj.getProperty("puzzlesidxpath"))).click();
     		  Assert.assertTrue(driver.findElement(By.xpath(obj.getProperty("puzzleslixpath"))).getText().equalsIgnoreCase("Puzzles"));
    		  
    		  
     		  
     		  
             //         for  menubar practice
              driver.findElement(By.xpath(obj.getProperty("practiceidxpath"))).click();
     		  Assert.assertTrue(driver.findElement(By.xpath(obj.getProperty("practicelixpath"))).getText().equalsIgnoreCase("Data Structures"));
    		  
     			driver.navigate().back();
     			
     	 
           driver.findElement(By.xpath(obj.getProperty("searchbox"))).click();
           driver.findElement(By.xpath(obj.getProperty("searchboxinput"))).sendKeys(new String[]{"selenium"});	
           driver.findElement(By.xpath(obj.getProperty("submit"))).click();
           Thread.sleep(10000);
           driver.switchTo().frame("master-1");
           WebElement element = driver.findElement(By.xpath(obj.getProperty("searchoutput"))); 
           System.out.print("================"+element.getText().toString());
           Assert.assertTrue(element.getText().contains("Selenium"));
    
           System.out.print("================"+element.getText().toString());
           driver.navigate().to(obj.getProperty("geeks"));
        
        
        // adds verification 
        
        Assert.assertTrue(driver.findElement(By.xpath(obj.getProperty("adds"))).getAttribute("class").contains("widget-area"));
        System.out.println("\n adds verified");
        
	   }
             
   }
         
         
         
         
  	
	 


