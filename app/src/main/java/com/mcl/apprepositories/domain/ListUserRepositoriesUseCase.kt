package com.mcl.apprepositories.domain

import com.mcl.apprepositories.core.UseCase
import com.mcl.apprepositories.data.model.Repo
import com.mcl.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}