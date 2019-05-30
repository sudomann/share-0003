package app.cookroom

import android.app.AlertDialog
import android.os.Bundle

/**
 * Shows an error message dialog.
 */
class ErrorDialog : androidx.fragment.app.DialogFragment() {
    private val ARG_MESSAGE = "message"

    override fun onCreateDialog(savedInstanceState: Bundle?): AlertDialog =
            AlertDialog.Builder(activity)
                    .setMessage(arguments?.getString(ARG_MESSAGE))
                    .setPositiveButton(android.R.string.ok)  { _, _ -> activity?.finish() }
                    .create()

    companion object {
        fun newInstance(message: String) = ErrorDialog().apply {
            arguments = Bundle().apply { putString(ARG_MESSAGE, message) }
        }
    }

}

