package com.shiun

import org.openqa.selenium.Keys
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions

class Chrome {
    val driver = ChromeDriver()

    fun openBrowser(address: String) {
        driver.manage().window().maximize()
        driver.get(address)
    }

    fun logIn(username: String, password: String) {
        for (i in 1..15) {
            driver.findElementById("username").sendKeys(Keys.BACK_SPACE)
            driver.findElementById("password").sendKeys(Keys.BACK_SPACE)
        }
        driver.findElementById("username").sendKeys(username)
        driver.findElementById("password").sendKeys(password)
        driver.findElementByCssSelector(".jss226:nth-child(2) > .jss201").click()
//        driver.findElementByCssSelector(".MuiButtonBase-root:nth-child(2) > .MuiButton-label").click()

//        driver.close()
    }

    fun addNetworkServer(name: String, server: String) {
        Thread.sleep(100)
//        driver.findElementByCssSelector(".MuiList-root:nth-child(1) > .MuiButtonBase-root:nth-child(1) .MuiTypography-root").click()
        driver.findElementByPartialLinkText("Network-").click()
        driver.findElementByCssSelector(".MuiButton-label").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("server").click()
        driver.findElementById("server").sendKeys(server)
        driver.findElementByCssSelector(".MuiButton-label").click()
    }

    fun delNetworkServer(server: String) {
        driver.findElementByCssSelector(".MuiList-root:nth-child(1) > .MuiButtonBase-root:nth-child(1) .MuiTypography-root")
            .click()
        driver.findElementByLinkText(server).click()
//        driver.findElementByCssSelector(".jss551 > .MuiButton-label").click()
//        assert(driver.switchTo().alert().text, is("Are you sure you want to delete this network-server?"))
//        driver.switchTo().alert().text, is("Are you sure you want to delete this network-server?"))
//        driver.switchTo().alert().accept()

    }

    fun register(email: String) {
        driver.findElementByCssSelector(".MuiButton-textPrimary > .MuiButton-label").click()
        driver.findElementById("username").click()
        driver.findElementById("username").sendKeys(email)
        driver.findElementByCssSelector(".MuiButton-label").click()
    }

    fun addGwProfile(name: String, channels: String) {
        Thread.sleep(1500)

//        driver.findElementByCssSelector(".jss273:nth-child(1) > .jss226:nth-child(2) > .jss296").clear()
        driver.findElementByPartialLinkText("Gateway-").click()
        driver.findElementByPartialLinkText("CREATE").click()
//        driver.findElementByCssSelector(".jss148").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("channelsStr").click()
        driver.findElementById("channelsStr").sendKeys(channels)

//        driver.findElementByPartialLinkText("network-server").click()
        driver.findElementByCssSelector(".css-1q6k2q9-placeholder").click()
        driver.findElementById("react-select-networkServerID-option-0").click()
//        driver.findElementByPartialLinkText("Create").click()
        driver.findElementByCssSelector(".jss226:nth-child(2) > .jss559").click()
    }

    fun addSvProfile(name: String) {
        Thread.sleep(1500)
        driver.findElementByPartialLinkText("Service-").click()
        driver.findElementByPartialLinkText("CREATE").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementByCssSelector(".css-1q6k2q9-placeholder").click()
        driver.findElementById("react-select-networkServerID-option-0").click()

        driver.findElementById("drMin").click()
        driver.findElementById("drMin").sendKeys(Keys.ARROW_LEFT)
        driver.findElementById("drMin").sendKeys("1")

        driver.findElementById("drMax").click()
        driver.findElementById("drMax").sendKeys(Keys.ARROW_LEFT)
        driver.findElementById("drMax").sendKeys("1")

        driver.findElementById("devStatusReqFreq").click()
        driver.findElementById("devStatusReqFreq").sendKeys(Keys.ARROW_LEFT)
        driver.findElementById("devStatusReqFreq").sendKeys("4")

        driver.findElementById("reportDevStatusBattery").click()
        driver.findElementById("reportDevStatusMargin").click()

        var js = "window.scrollTo(0,1000)"
        driver.executeScript(js)

//        driver.findElementByCssSelector(".jss").click()
        driver.findElementById("drMax").click()
        driver.findElementById("drMax").sendKeys(Keys.TAB)
        driver.findElementById("drMax").sendKeys(Keys.ENTER)

    }

    fun addDvProfile(name: String) {
        Thread.sleep(1500)
        driver.findElementByPartialLinkText("Device-").click()
        driver.findElementByPartialLinkText("CREATE").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("networkServerID").click()
        driver.findElementById("react-select-networkServerID-option-0").click()

        driver.findElementById("macVersion").click()
        driver.findElementById("react-select-macVersion-option-1").click()

        driver.findElementById("regParamsRevision").click()
        driver.findElementById("react-select-regParamsRevision-option-1").click()

//        var pp = driver.findElementByCssSelector(".jss226:nth-child(2) .jss578").location
//        println(pp)
        Actions(driver).moveByOffset(516, 209).click().perform()
//        driver.findElementByCssSelector(".jss226:nth-child(2) .jss578").click()
        driver.findElementById("supportsJoin").click()
        driver.findElementById("supportsJoin").sendKeys(Keys.TAB)
        driver.findElementById("supportsJoin").sendKeys(Keys.ENTER)
    }
}