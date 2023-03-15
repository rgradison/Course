package com.zyberfox.course.controller;
import com.zyberfox.course.model.Course;
import com.zyberfox.course.service.CourseService;

import com.zyberfox.topic.model.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @RequestMapping("/topics/{id}/courses")
    public List<Course> allCourse() {
        return courseService.getAllCourses();
    }
    //Not recommended
    //OR @RequestMapping("/topics/{foo}") then public Topic getTopic(@PathVariable("foo") String id) {
    // return topicService.getTopic(id);
    //}
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course , @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

}
