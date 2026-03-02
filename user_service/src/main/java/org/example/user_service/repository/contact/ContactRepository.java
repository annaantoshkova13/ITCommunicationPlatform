package org.example.user_service.repository.contact;

import org.example.user_service.entity.contact.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}

