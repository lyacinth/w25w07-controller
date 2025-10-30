package kr.ac.kumoh.s20220052.w25w07_controller.service

import kr.ac.kumoh.s20220052.w25w07_controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun getAllSongs(): List<Song>{
        return listOf(
            Song(id = 1, title = "Golden", singer="Hunter/x")
        )
    }
}