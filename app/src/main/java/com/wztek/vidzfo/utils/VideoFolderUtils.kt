package com.wztek.vidzfo.utils

import android.os.Environment
import java.io.File

object VideoFolderUtils {

    fun getChapterVideos(): Map<String, List<String>> {
        val chapterVideosMap = mutableMapOf<String, MutableList<String>>()

        val internalStorage = Environment.getExternalStorageDirectory()
        collectChapterVideos(internalStorage, chapterVideosMap)

        val externalStorage = Environment.getExternalStorageDirectory().absoluteFile
        if (externalStorage != internalStorage) {
            collectChapterVideos(externalStorage, chapterVideosMap)
        }

        return chapterVideosMap
    }

    private fun collectChapterVideos(
        folder: File,
        chapterVideosMap: MutableMap<String, MutableList<String>>
    ) {
        val files = folder.listFiles() ?: return

        for (file in files) {
            if (file.isDirectory) {
                val chapterName = file.name
                if (!chapterVideosMap.containsKey(chapterName)) {
                    chapterVideosMap[chapterName] = mutableListOf()
                }
                collectVideosInChapter(file, chapterVideosMap[chapterName]!!)
                collectChapterVideos(file, chapterVideosMap)
            }
        }
    }


    private fun collectVideosInChapter(chapterFolder: File, videosList: MutableList<String>) {
        val files = chapterFolder.listFiles() ?: return

        for (file in files) {
            if (file.isFile && isVideoFile(file.absolutePath)) {
                videosList.add(file.absolutePath)
            }
        }
    }

    private fun isVideoFile(filePath: String): Boolean {
        val videoExtensions = arrayOf("mp4", "avi", "mkv", "mov", "wmv")
        for (extension in videoExtensions) {
            if (filePath.toLowerCase().endsWith(extension)) {
                return true
            }
        }
        return false
    }

}

