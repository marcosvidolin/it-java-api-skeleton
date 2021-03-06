package com.ciandt.skeleton.web.rest.v1.resource;

import com.ciandt.skeleton.core.domain.Post;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vidolima.ditiow.resource.AbstractResource;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * This is the {@link Post}'s resource representation. This class is responsible for expose the
 * entity as a rest resource including resource validations.
 *
 * @author mvidolin
 * @since Jul 29, 2019
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostUpdateResource extends AbstractResource<Post> {

  @Length(min = 50, max = 200)
  private String title;
  @NotEmpty
  @Length(min = 50, max = 3000)
  private String content;
}
