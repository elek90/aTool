package dk.eleknet.atool.extensions

fun Double?.orValue(value: Double): Double {
    return this ?: value
}
