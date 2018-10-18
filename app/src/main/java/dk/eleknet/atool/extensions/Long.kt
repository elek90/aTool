package dk.eleknet.atool.extensions

fun Long?.orValue(value: Long): Long {
    return this ?: value
}