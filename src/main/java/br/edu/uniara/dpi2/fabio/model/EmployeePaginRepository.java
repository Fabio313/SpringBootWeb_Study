package br.edu.uniara.dpi2.fabio.model;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeePaginRepository extends PagingAndSortingRepository<Employee, Long> {
}
