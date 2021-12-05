package ru.fylmr.poplibs_nov21.domain

import io.reactivex.rxjava3.core.Observable
import ru.fylmr.poplibs_nov21.model.GithubUserModel
import java.util.concurrent.TimeUnit

class GithubUsersRepository {

    private val users = listOf(
        GithubUserModel("user1"),
        GithubUserModel("user2"),
        GithubUserModel("user3"),
        GithubUserModel("user4"),
        GithubUserModel("user5"),
        GithubUserModel("user6"),
    )

    fun getUsers(): Observable<List<GithubUserModel>> {
        return Observable.just(users)
    }
}
