package com.scratchLearn.scratchLearn.entites

import org.intellij.lang.annotations.Identifier
import org.springframework.boot.autoconfigure.domain.EntityScan

@EntityScan
data class Course (
        @Identifier
        var id:Long,
        var title:String,
        var description:String?
)