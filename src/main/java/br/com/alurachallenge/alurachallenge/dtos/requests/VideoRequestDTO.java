package br.com.alurachallenge.alurachallenge.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoRequestDTO {

//    @NotNull(message = "{video.videoid.not.null}")
//    @Min(value = 1)
    private Long id;

//    @NotNull(message = "{video.videotittle.not.null}")
    private String tittle;

    private Long categoryId;

//    @NotNull(message = "{video.videodescription.not.null}")
    private String description;

//    @NotNull(message = "{video.videourl.not.null}")
    private String url;


}
