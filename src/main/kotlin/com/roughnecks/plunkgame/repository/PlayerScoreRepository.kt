package com.roughnecks.plunkgame.repository

import com.roughnecks.plunkgame.model.PlayerScore
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlayerScoreRepository : JpaRepository<PlayerScore, Long>