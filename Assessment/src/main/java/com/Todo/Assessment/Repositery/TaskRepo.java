package com.Todo.Assessment.Repositery;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Todo.Assessment.Util.*;

public interface TaskRepo extends MongoRepository<Tasks, Integer> {


}
