package dk.eleknet.atool.extensions

fun Boolean?.orValue(value: Boolean): Boolean {
    return this ?: value
}