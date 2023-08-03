package Pages;

import CommonMethods.Util;
import Utility.navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.PrintWriter;

public class portal {
    public static void getBeelineStatus(String[] reqID, WebDriver driver,PrintWriter out) {
        navigate nav = new navigate();

        Util.time(out);
        //dropDowmn
        driver.findElement(By.id("MenuItem_5afb9f166b034b1d8d3cace9ed5ca994")).click();
        //request prompt
        driver.findElement(By.id("MenuItem_eb84ee798caf4bbcb2e002ab5e7ad0b5")).click();
        int S=0;
        String endDate;
        System.out.println("SL,RequestID,Id Status,Last Name, First Name,Status,End Date");
        out.print("SL,RequestID,ID Status,Last Name, First Name,Status,End Date");
        for(String s : reqID) {
            System.out.println();
            out.println("");


            S=S+1;


            //send ID & search
            driver.findElement(By.cssSelector("input[id='Master_PageContentPlaceHolder_screen_beelineForm_partEditor_procurementRequestGroupID']")).sendKeys(s);
            driver.findElement(By.id("beeline-form-filter_Master_PageContentPlaceHolder_screen_beelineForm")).click();

            //check ID is present or not
            try{
                driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_selectionList\"]/tbody/tr/td[2]/a")).click();
            }
            catch (Exception e){
                System.out.print(S +","+s+","+"BeelineID not Found / Not Released for TCS");
                out.print(S +","+s+","+","+","+", BeelineID not Found / Not Released for TCS");

                nav.navigateBack(1,driver);
                continue;
            }

            int backCounnt;

            //check the desired page
            if(driver.getTitle().equalsIgnoreCase("Beeline - Request Group Summary"))
            {
                backCounnt=4;
                endDate=driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_beelineForm_requestGroupRequestsList_requestsSelectionList\"]/tbody/tr/td[7]")).getText();
                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table/tbody/tr[2]/td/div/table[2]/tbody/tr/td/table/tbody/tr/td[2]/a")).click();



            }

            else {
                backCounnt=3;
                endDate=driver.findElement(By.xpath("//*[@id=\"Master_PageContentPlaceHolder_screen_selectedTab_summary_beelineForm_endDateLabel\"]")).getText();
            }


            driver.findElement(By.id("Master_PageContentPlaceHolder_screen_tabControl_tab_2")).click();

            int row = driver.findElements(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/thead/tr[2]/th")).size();
            int col = driver.findElements(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr")).size();
            try{
                if (row == 11) {
                    for(int k=1;k<=col;k++){
//                        if ( driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText().equalsIgnoreCase("withdrawn")){
//
//                            continue;
//                        }
//                        else if ( driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText().equalsIgnoreCase("HM Disqualified")){
//                            System.out.println();
//                            continue;
//                        }
//                        else {
                        System.out.println(S +","+
                                s+"," +
                                driver.findElement(By.cssSelector("span[class='BeelineLabel'][id='Master_PageContentPlaceHolder_screen_beelineForm_statusLabel']")).getText()+","+

                                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[4]/a")).getText()+"," +

                                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText()+"," +
                                endDate
                        );
                        out.println(S +","+
                                s+"," +
                                driver.findElement(By.cssSelector("span[class='BeelineLabel'][id='Master_PageContentPlaceHolder_screen_beelineForm_statusLabel']")).getText()+","+

                                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[4]/a")).getText()+"," +

                                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+k+"]/td[7]")).getText()+"," +
                                endDate);


//                        }

                    }


                } else {
                    for(int l=1;l<=col;l++){
//                        if ( driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText().equalsIgnoreCase("withdrawn")){
//
//                            continue;
//
//                        }
//                        else if ( driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText().equalsIgnoreCase("HM Disqualified")){
//                            continue;
//
//                        }
//                        else{
                        System.out.println(S +","+
                                s +","+
                                driver.findElement(By.cssSelector("span[class='BeelineLabel'][id='Master_PageContentPlaceHolder_screen_beelineForm_statusLabel']")).getText()+

                                "," +driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[3]/a")).getText()+","  +

                                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText()+"," +
                                endDate
                        );
                        out.println(S +","+
                                s +","+
                                driver.findElement(By.cssSelector("span[class='BeelineLabel'][id='Master_PageContentPlaceHolder_screen_beelineForm_statusLabel']")).getText()+

                                "," +driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[3]/a")).getText()+","  +

                                driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[2]/div/table[4]/tbody/tr/td/div/table[2]/tbody/tr[2]/td/table/tbody/tr["+l+"]/td[6]")).getText()+"," +
                                endDate);

                    }

                }

//                }

            }
            catch (Exception e){
                System.out.print(S+","+s+","
                        +
                        driver.findElement(By.cssSelector("span[class='BeelineLabel'][id='Master_PageContentPlaceHolder_screen_beelineForm_statusLabel']")).getText()+","+
                        "No Profile Submitted!"+
                        endDate);
                out.print(S+","+s+","+driver.findElement(By.cssSelector("span[class='BeelineLabel'][id='Master_PageContentPlaceHolder_screen_beelineForm_statusLabel']")).getText()+","+
                        ","+","+"No Profile Submitted!,"+
                        endDate);

            }
            navigate.navigateBack(backCounnt,driver);





        }
        out.close();
        }

    }
