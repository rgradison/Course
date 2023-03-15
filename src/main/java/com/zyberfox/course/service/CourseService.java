package com.zyberfox.course.service;

import com.zyberfox.course.repository.CourseRepository;
import com.zyberfox.course.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

      CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    /*private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Framework", "Description"),
            new Topic("Java", "Core", "Description"),
            new Topic("Javascript", "Javascript", "Description"))
    );*/

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();

        courseRepository.findAll().forEach(courses::add);

        return courses;
    }

    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, course);
//                return;
//            }
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
