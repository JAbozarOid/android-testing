package com.example.androidtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }


    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "reza",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Abozar",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    // empty password
    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Abozar",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    // password was repeated incorrectly
    @Test
    fun `password repeated incorrectly return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Abozar",
            "123",
            "321"
        )

        assertThat(result).isFalse()
    }

    // password contains less than 2 digits
    @Test
    fun `password contains less than 2 digits return false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Abozar",
            "12",
            "12"
        )

        assertThat(result).isFalse()
    }
}