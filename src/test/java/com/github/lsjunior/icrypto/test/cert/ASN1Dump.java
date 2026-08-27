package com.github.lsjunior.icrypto.test.cert;

import java.io.File;
import java.io.FileInputStream;
import java.security.cert.Certificate;

import org.junit.jupiter.api.Test;

import com.github.lsjunior.icrypto.core.certificate.util.Certificates;
import com.github.lsjunior.icrypto.ext.icpbrasil.certificate.CertificadoPj;

public class ASN1Dump {

  @Test
  void testLidersis() throws Exception {
    File file = new File("D:\\Data\\Certs\\lidersis\\331952_LIDERSIS_SISTEMAS_E_TECNOLOGIAS_DA_INFORMACAO_LTD_11717421000154.cer");
    Certificate certificate = Certificates.toCertificate(new FileInputStream(file));
    CertificadoPj certificadoPj = (CertificadoPj) CertificadoPj.getInstance(certificate);
    System.out.println(certificadoPj.getCpfResponsavel());
    System.out.println(certificadoPj.getDadoPessoa().getCpf());
    System.out.println(certificadoPj.getCpfResponsavel());
  }

}
