package kr.ac.kumoh.s20220052.w25w07_controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf(
        "Golden",
        "걘 아니야",
        "카사노바",
    )
    @GetMapping("/songs")
    fun getSongList() = title
}