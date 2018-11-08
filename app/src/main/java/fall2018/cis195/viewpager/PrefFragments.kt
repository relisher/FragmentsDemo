package fall2018.cis195.viewpager

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import android.R.xml

/**
 * Created by arelin on 11/7/18.
 */
class PrefsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        // Load the preferences from an XML resource
        setPreferencesFromResource(R.layout.preferences_layout, rootKey)
    }
}