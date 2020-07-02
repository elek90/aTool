package dk.eleknet.atool.util.recyclerview

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager

/**
 * RecyclerView layout manager which can disable vertical scrolls.
 *
 * Usage example:
 * val manager = NoScrollLayoutManager(view?.context)
 * rc.layoutManager = manager
 */
class NoScrollLayoutManager(context: Context?) : LinearLayoutManager(context) {

    private var isScrollEnabled: Boolean = true

    fun setScrollEnabled(enabled: Boolean) {
        isScrollEnabled = enabled
    }

    override fun canScrollVertically(): Boolean {
        return isScrollEnabled && super.canScrollVertically()
    }
}