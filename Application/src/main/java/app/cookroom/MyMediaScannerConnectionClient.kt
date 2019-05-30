/*
package app.cookroom

import android.content.Context


import android.media.MediaScannerConnection
import android.net.Uri
import app.cookroom.R
import java.io.File


internal class MyMediaScannerConnectionClient(ctx: Context, file: File, mimetype: String) : MediaScannerConnection.MediaScannerConnectionClient {
    // TODO: Need to register media to Android gallery/
    // SO user is not forced to manually fetch using file explorer
    private val mFilename: String
    private val mMimetype: String? = "video/mp4"
    private val mConn: MediaScannerConnection

    init {
        this.mFilename = file.getAbsolutePath()
        mConn = MediaScannerConnection(ctx, this)
        mConn.connect()
    }

    override fun onMediaScannerConnected() {
        mConn.scanFile(mFilename, mMimetype)
    }

    fun onScanCompleted(path, uri) {
        mConn.disconnect()
    }
}*/
