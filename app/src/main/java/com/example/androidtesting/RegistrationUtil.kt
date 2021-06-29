package com.example.androidtesting

/**
 * it's singleton
 * we don't need create an instance of that class to use the function that is in it
 */
object RegistrationUtil {

    private val existingUsers = listOf("Abozar", "Alireza")

    /**
     * the input is not valid if ...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */
    fun validationRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }

        if (username in existingUsers) {
            return false

        }
        if (password != confirmedPassword) {
            return false

        }
        if (password.count { it.isDigit() } < 2) {
            return false

        }

        return true
    }
}