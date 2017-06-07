/*
 *
 *
 *  * Copyright (c) 2017 Leo Lee(lichl.1980@163.com).
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License. You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *
 */

package com.xt.yde.job;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.sunyata.octopus.model.GameModel;
import org.sunyata.octopus.model.GamePhaseModel;

/**
 * Created by leo on 17/3/20.
 */
@Mapper
public interface GameModelMapper {
    @Insert("INSERT INTO Game(gameInstanceId, gameType,userName,createDateTime,lastSuccessStateName) " +
            "VALUES(#{gameInstanceId}, #{gameType},#{userName},#{createDateTime},#{lastSuccessStateName})")
    int createGameModel(GameModel gameModel);


    @Insert("INSERT INTO Phase(phaseId, gameInstanceId,phaseName,createDateTime,phaseDataString,orderBy) " +
            "VALUES(#{phaseId}, #{gameInstanceId},#{phaseName},#{createDateTime},#{phaseDataString},#{orderBy})")
    void addPhase(GamePhaseModel gamePhaseModel);


    @Update("UPDATE Game set lastSuccessStateName=#{lastSuccessStateName} WHERE gameInstanceId=#{gameInstanceId}")
    int updateGameModel(@Param("gameInstanceId") String gameInstanceId, @Param("lastSuccessStateName") String
            lastSuccessStateName);

}