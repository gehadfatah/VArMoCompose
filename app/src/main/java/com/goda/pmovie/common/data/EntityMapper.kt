package com.goda.pmovie.common.data

interface EntityMapper<SRC, DST> {
    fun mapFromEntity(data: SRC): DST
}