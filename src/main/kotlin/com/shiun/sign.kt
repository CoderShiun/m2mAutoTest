package com.shiun

import org.openqa.selenium.Keys
import org.openqa.selenium.chrome.ChromeDriver

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

fun register(email: String) {
    driver.findElementByCssSelector(".MuiButton-textPrimary > .MuiButton-label").click()
    driver.findElementById("username").click()
    driver.findElementById("username").sendKeys(email)
    driver.findElementByCssSelector(".MuiButton-label").click()
}