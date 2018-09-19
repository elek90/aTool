package dk.eleknet.atool.extensions

import java.util.regex.Pattern

fun String?.orValue(value: String): String {
    return if (this.isNullOrEmpty()) {
        value
    } else {
        this!!
    }
}

fun String?.isEmail(): Boolean {
    // Regex from: http://emailregex.com/
    val emailRegex = "(?:[a-z0-9!#\$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#\$%&'*+/=?^_`{|}~-]+)*|\"" +
        "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")" +
        "@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\" +
        "[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]" +
        "*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\" +
        "\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"
    val pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE or Pattern.MULTILINE)
    val m = pattern.matcher(this)
    return m.find()
}
