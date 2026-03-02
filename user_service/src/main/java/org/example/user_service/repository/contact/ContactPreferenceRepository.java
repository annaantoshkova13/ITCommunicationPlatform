package org.example.user_service.repository.contact;

import org.example.user_service.entity.contact.ContactPreference;
import org.springframework.data.repository.CrudRepository;

public interface ContactPreferenceRepository extends CrudRepository<ContactPreference, Long> {
}
