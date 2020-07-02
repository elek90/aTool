package dk.eleknet.atool.extensions

fun Int?.orValue(value: Int): Int {
    return this ?: value
}