package de.htw_berlin.plan_it;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<EventDTO> getAllEvents() {

        EventDTO event1 = new EventDTO();
        event1.setTitle("Webtechnologien");
        event1.setStart((LocalDateTime.of(2026, 10, 12, 9, 45)));
        event1.setEnd((LocalDateTime.of(2026, 10, 12, 11, 15)));
        event1.setProfessor("Arif Widder");
        event1.setModule("Webtechnologien");
        event1.setRoom("A 029");

        EventDTO event2 = new EventDTO();
        event2.setTitle("Milestone 1");
        event2.setProfessor("Nasaltev");
        event2.setModule("Webtechnologien");
        event2.setDeadline((LocalDateTime.of(2026, 10, 18, 23, 59)));

        EventDTO event3 = new EventDTO();
        event3.setTitle("Webtech Klausur");
        event3.setProfessor("Arif Widder");
        event3.setRoom("A 029");
        event3.setModule("Webtechnologien");
        event3.setStart((LocalDateTime.of(2027, 2, 18, 10, 0)));
        event3.setEnd((LocalDateTime.of(2027, 2, 18, 12, 0)));

        return List.of(event1, event2, event3);

    }
}
