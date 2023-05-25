package com.mdtlabs.coreplatform.spiceservice.metadata.controller;

import com.mdtlabs.coreplatform.common.controller.GenericController;
import com.mdtlabs.coreplatform.common.model.entity.spice.Lifestyle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Lifestyle Controller used to perform any action in the lifestyle module like read and
 * write.
 * </p>
 *
 * @author VigneshKumar created on Jun 30, 2022
 */
@RestController
@RequestMapping("/lifestyle")
public class LifestyleController extends GenericController<Lifestyle> {

}
