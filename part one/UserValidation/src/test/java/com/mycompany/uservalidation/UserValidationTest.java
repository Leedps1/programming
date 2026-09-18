/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.uservalidation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidationTest {

    @Test
    public void testCheckUserName_Valid() {
        UserValidation instance = new UserValidation("Lee_", "LONWABOLEE1$$", "+27797723633");
        assertTrue(instance.checkUserName());
    }

    @Test
    public void testCheckUserName_Invalid_NoUnderscore() {
        UserValidation instance = new UserValidation("Lee", "LONWABOLEE1$$", "+27797723633");
        assertFalse(instance.checkUserName());
    }

    @Test
    public void testCheckUserName_Invalid_TooLong() {
        UserValidation instance = new UserValidation("Lee____", "LONWABOLEE1$$", "+27797723633");
        assertFalse(instance.checkUserName());
    }

    @Test
    public void testCheckPassword_Valid() {
        UserValidation instance = new UserValidation("Lee_", "LONWABOLEE1$$", "+27797723633");
        assertTrue(instance.checkPassword());
    }

    @Test
    public void testCheckPassword_Invalid() {
        UserValidation instance = new UserValidation("Lee_", "password", "+27797723633");
        assertFalse(instance.checkPassword());
    }

    @Test
    public void testCheckCellPhoneNumber_Valid() {
        UserValidation instance = new UserValidation("Lee_", "LONWABOLEE1$$", "+27797723633");
        assertTrue(instance.CheckCellPhoneNumber());
    }

    @Test
    public void testCheckCellPhoneNumber_Invalid() {
        UserValidation instance = new UserValidation("Lee_", "LONWABOLEE1$$", "0797723633");
        assertFalse(instance.CheckCellPhoneNumber());
    }

    @Test
    public void testGetUserMessage() {
        UserValidation instance = new UserValidation("Lee_", "LONWABOLEE1$$", "+27797723633");
        assertEquals("Username successfully captured", instance.GetUserMessage());
    }

    @Test
    public void testGetPasswordMessage() {
        UserValidation instance = new UserValidation("Lee_", "LONWABOLEE1$$", "+27797723633");
        assertEquals("Password is successfully captured", instance.GetPasswordMessage());
    }
}