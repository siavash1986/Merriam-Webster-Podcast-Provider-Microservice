package me.siavash.wotd.podcast

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PodcastDownloaderApplication

fun main(args: Array<String>) {
	runApplication<PodcastDownloaderApplication>(*args)
}
