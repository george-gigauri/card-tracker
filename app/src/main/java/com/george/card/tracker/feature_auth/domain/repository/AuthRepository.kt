package com.george.card.tracker.feature_auth.domain.repository

interface AuthRepository {

    suspend fun login(email: String, password: String)

    suspend fun loginViaGoogle()

    suspend fun loginViaFacebook()

    suspend fun register(email: String, password: String, name: String, mobile: String)
}