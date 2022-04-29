package BHNStore.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import BHNStore.domain.Product;
import BHNStore.reponsitory.ProductReposity;
import BHNStore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	ProductReposity productreposity;

	public ProductServiceImpl(ProductReposity productreposity) {
		super();
		this.productreposity = productreposity;
	}

	@Override
	public List<Product> findByNameContaining(String name) {
		return productreposity.findByNameContaining(name);
	}

	@Override
	public <S extends Product> S save(S entity) {
		return productreposity.save(entity);
	}

	@Override
	public <S extends Product> Optional<S> findOne(Example<S> example) {
		return productreposity.findOne(example);
	}

	@Override
	public List<Product> findAll() {
		return productreposity.findAll();
	}

	@Override
	public Page<Product> findAll(Pageable pageable) {
		return productreposity.findAll(pageable);
	}

	@Override
	public List<Product> findAll(Sort sort) {
		return productreposity.findAll(sort);
	}

	@Override
	public List<Product> findAllById(Iterable<Long> ids) {
		return productreposity.findAllById(ids);
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productreposity.findById(id);
	}

	@Override
	public <S extends Product> List<S> saveAll(Iterable<S> entities) {
		return productreposity.saveAll(entities);
	}

	@Override
	public void flush() {
		productreposity.flush();
	}

	@Override
	public <S extends Product> S saveAndFlush(S entity) {
		return productreposity.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return productreposity.existsById(id);
	}

	@Override
	public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
		return productreposity.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
		return productreposity.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Product> entities) {
		productreposity.deleteInBatch(entities);
	}

	@Override
	public <S extends Product> long count(Example<S> example) {
		return productreposity.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Product> entities) {
		productreposity.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return productreposity.count();
	}

	@Override
	public <S extends Product> boolean exists(Example<S> example) {
		return productreposity.exists(example);
	}

	@Override
	public void deleteById(Long id) {
		productreposity.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		productreposity.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Product entity) {
		productreposity.delete(entity);
	}

	@Override
	public <S extends Product, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return productreposity.findBy(example, queryFunction);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		productreposity.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		productreposity.deleteAllInBatch();
	}

	@Override
	public Product getOne(Long id) {
		return productreposity.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Product> entities) {
		productreposity.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		productreposity.deleteAll();
	}

	@Override
	public Product getById(Long id) {
		return productreposity.getById(id);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example) {
		return productreposity.findAll(example);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
		return productreposity.findAll(example, sort);
	}

	
	
}
