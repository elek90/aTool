package dk.eleknet.atool.extensions

fun Float?.orValue(value: Float): Float {
    return this ?: value
}