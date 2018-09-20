package dk.eleknet.atool.extensions

import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.view.View

/**
 * Changes a view to visible
 */
fun View.setVisible() {
    visibility = View.VISIBLE
}

/**
 * Changes a view to invisible
 */
fun View.setInvisible() {
    visibility = View.INVISIBLE
}

/**
 * Changes a view to gone
 */
fun View.setGone() {
    visibility = View.GONE
}

/**
 * Displays a snackbar
 *
 * @param text - Text to be displayed
 * @param duration - Duration the message should be displayed (ms)
 */
fun View.showSnackbar(text: String, duration: Int = Snackbar.LENGTH_LONG) {
    Snackbar.make(this, text, duration).show()
}

/**
 * Displays a snackbar
 *
 * @param text - String resource to be displayed
 * @param duration - Duration the message should be displayed (ms)
 */
fun View.showSnackbar(@StringRes text: Int, duration: Int = Snackbar.LENGTH_LONG) {
    showSnackbar(context.getString(text), duration)
}

/**
 * Displays a snackbar with an action button
 *
 * @param text - Text to be displayed
 * @param duration - Duration the message should be displayed (ms)
 * @param action - Text to be displayed as action
 * @param callback - OnClick callback from action
 */
fun View.showSnackbarWithAction(text: String, duration: Int = Snackbar.LENGTH_LONG, action: String, callback: View.OnClickListener) {
    Snackbar.make(this, text, duration)
        .setAction(action, callback)
        .show()
}

/**
 * Displays a snackbar with an action button
 *
 * @param text - String resource to be displayed
 * @param duration - Duration the message should be displayed (ms)
 * @param text - String resource to be displayed as action
 * @param callback - OnClick callback from action
 */
fun View.showSnackbarWithAction(@StringRes text: Int, duration: Int = Snackbar.LENGTH_LONG, @StringRes action: Int, callback: View.OnClickListener) {
    showSnackbarWithAction(context.getString(text), duration, context.getString(action), callback)
}