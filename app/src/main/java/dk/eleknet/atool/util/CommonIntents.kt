package dk.eleknet.atool.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore

/**
 * Starts the phone app with the supplied string as phone number
 *
 * @param phoneNumber - Phone number as a string
 */
fun Context.openPhone(phoneNumber: String) {
    val intent = Intent(Intent.ACTION_DIAL)
    intent.data = Uri.parse("tel: $phoneNumber")
    if (intent.resolveActivity(packageManager) != null) {
        startActivity(intent)
    }
}

/**
 * Opens an email client and passes in the supplied string as recipient
 *
 * @param email - The email to fill in as recipient
 */
fun Context.openEmail(email: String) {
    val intent = Intent(Intent.ACTION_SENDTO)
    intent.data = Uri.parse("mailto:")
    intent.putExtra(Intent.EXTRA_EMAIL, email)
    if (intent.resolveActivity(packageManager) != null) {
        startActivity(intent)
    }
}

/**
 * Opens a web site in a browser
 *
 * @param url - The url of the page to be opened
 */
fun Context.openWebSite(url: String) {
    val page = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, page)
    startActivity(intent)
}

/**
 * Opens a map with the specified geo string
 * A geo string should start with geo:
 *
 * Example:
 * geo:0,0?q=street+zipCode+city
 *
 * @param mapString - The string to be passed to the map
 */
fun Context.openMap(mapString: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    val uri = Uri.parse(Uri.encode(mapString))
    intent.data = uri
    if (intent.resolveActivity(this.packageManager) != null) {
        startActivity(intent)
    }
}

/**
 * Sends a camera intent to capture an image
 *
 * @param location - Uri to the folder where the file should be saved
 * @param targetFilename - Name for the file
 * @param requestCode - The requestCode to be returned to the activity.
 */
fun Activity.captureImage(location: Uri, targetFilename: String, requestCode: Int) {
    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    intent.putExtra(
        MediaStore.EXTRA_OUTPUT,
        Uri.withAppendedPath(location, targetFilename)
    )
    if (intent.resolveActivity(packageManager) != null) {
        startActivityForResult(intent, requestCode)
    }
}

/**
 * Sends a camera intent to record a video
 *
 * @param location - Uri to the folder where the file should be saved
 * @param targetFilename - Name for the file
 * @param requestCode - The requestCode to be returned to the activity.
 */
fun Activity.captureVideo(location: Uri, targetFilename: String, requestCode: Int) {
    val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
    intent.putExtra(
        MediaStore.EXTRA_OUTPUT,
        Uri.withAppendedPath(location, targetFilename)
    )
    if (intent.resolveActivity(packageManager) != null) {
        startActivityForResult(intent, requestCode)
    }
}