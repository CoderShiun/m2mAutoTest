package com.shiun

import org.openqa.selenium.Keys
import org.openqa.selenium.chrome.ChromeDriver

class Chrome {
    val driver = ChromeDriver()

    fun openBrowser(address: String) {
        driver.manage().window().maximize()
        driver.get(address)
    }

    fun logIn(username: String, password: String) {
        /*for (i in 1..15) {
            driver.findElementById("username").sendKeys(Keys.BACK_SPACE)
            driver.findElementById("password").sendKeys(Keys.BACK_SPACE)
        }*/
        driver.findElementById("username").sendKeys(username)
        driver.findElementById("password").sendKeys(password)
//        driver.findElementByCssSelector(".jss226:nth-child(2) > .jss201").click()
        driver.findElementByCssSelector(".MuiButtonBase-root:nth-child(2) > .MuiButton-label").click()

//        driver.close()
    }

    fun addNetworkServer(name: String, server: String){
        Thread.sleep(100)
        driver.findElementByCssSelector(".MuiList-root:nth-child(1) > .MuiButtonBase-root:nth-child(1) .MuiTypography-root").click()
        driver.findElementByCssSelector(".MuiButton-label").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("server").click()
        driver.findElementById("server").sendKeys(server)
        driver.findElementByCssSelector(".MuiButton-label").click()
    }

    fun delNetworkServer(server: String){
        driver.findElementByCssSelector(".MuiList-root:nth-child(1) > .MuiButtonBase-root:nth-child(1) .MuiTypography-root").click()
        driver.findElementByLinkText(server).click()
//        driver.findElementByCssSelector(".jss551 > .MuiButton-label").click()
//        assert(driver.switchTo().alert().text, is("Are you sure you want to delete this network-server?"))
//        driver.switchTo().alert().text, is("Are you sure you want to delete this network-server?"))
//        driver.switchTo().alert().accept()

    }
}