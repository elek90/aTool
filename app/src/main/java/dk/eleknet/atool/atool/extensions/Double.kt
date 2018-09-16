package dk.eleknet.atool.atool.extensions

fun Double?.orValue(value: Double): Double {
    return this ?: value
}
