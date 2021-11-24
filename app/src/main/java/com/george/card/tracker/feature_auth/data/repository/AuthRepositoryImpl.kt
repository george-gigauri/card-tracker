package com.george.card.tracker.feature_auth.data.repository

import com.george.card.tracker.feature_auth.domain.repository.AuthRepository

class AuthRepositoryImpl: AuthRepository {

    override suspend fun login(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun loginViaGoogle() {
        TODO("Not yet implemented")
    }

    override suspend fun loginViaFacebook() {
        TODO("Not yet implemented")
    }

    override suspend fun register(email: String, password: String, name: String, mobile: String) {
        TODO("Not yet implemented")
    }
}